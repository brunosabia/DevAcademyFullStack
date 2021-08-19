console.log('arquivo validacao.js');
//evento disparado quando a janela termina de carregar
window.addEventListener('load', (evento_load) => {
    let form = document.querySelector('.form-auth');
    //console.log(form);
    let btnSubmit = document.querySelector('.form-auth button');
    //console.log(btnSubmit);
    let divErros = document.querySelector('div.erros');

    let campoData = document.createElement('input');
    campoData.setAttribute("name", "data");
    campoData.setAttribute("type", "date");
    campoData.setAttribute("max", "2005-08-19")
    campoData.setAttribute("min", "1901-08-19")
    form.insertBefore(campoData, divErros);

    let listInputs = document.querySelectorAll('.form-auth input');
    console.log(listInputs);

    //addEventListener('nome do evento', função disparada);
    btnSubmit.addEventListener('click', (evento_submit) => {
        
        let pErros = document.querySelectorAll('.erro');
        console.log(pErros);
        for(const erro of pErros){
            if(erro != null){  
                erro.parentNode.removeChild(erro);
            }
        }

        //interrompe o envio do form
        evento_submit.preventDefault();

        //busca o inputNome
        let inputNome = document.querySelector('input[name="name"]');

        let listaErros = document.querySelector('.erros ul');
        let erros = [];
        //zerar o conteudo da lista no html
        listaErros.innerHTML = "";

        //verificação de inputs
        for (const input of listInputs) {
            if (input.value == '') {
                input.insertAdjacentHTML('afterend', `<p class="erro" style="color:red;">O campo ${input.name} esta vazio</p>`);
                //erros.push('Campo ' + input.name + ' está vazio!');
            } else {
                if (input.name == 'nome') {
                    if (input.value.length >= 80 || input.value.length <= 2) {
                        input.insertAdjacentHTML("afterend", `<p class ="erro"style="color: red">O campo "${input.name}" deve ter entre 80 e 2 caracteres</p>`)
                    }
                }
                if (input.name == 'senha') {
                    if (input.value.length == 0) {
                        erros.push('campo Password está vazio');
                    }
                }
                if (input.name == 'sobrenome') {
                    if (input.value.length >= 100 || input.value.length <= 2) {
                        input.insertAdjacentHTML("afterend", `<p style="color: red;" class="erro">O campo "${input.name}" deve ter entre 100 e 2 caracteres</p>`)
                    }
                }
                if (input.name == 'email') {
                    if (input.value.length >= 180 || input.value.length <= 10) {
                        input.insertAdjacentHTML("afterend", `<p class ="erro" style="color: red">O campo "${input.name}" deve ter entre 180 e 10 caracteres</p>`)
                    }
                    if (!input.value.includes('@')){
                        input.insertAdjacentHTML("afterend", `<p class ="erro" style="color: red">O campo "${input.name}" deve ter "@"</p>`)
                    }
                    if (!input.value.includes('.')){
                        input.insertAdjacentHTML("afterend", `<p class ="erro" style="color: red">O campo "${input.name}" deve ter "."</p>`)
                    }
                }
                if (input.name == 'usuario') {
                    if (input.value.length >= 15 || input.value.length <= 10) {
                        input.insertAdjacentHTML("afterend", `<p class ="erro" style="color: red">O campo "${input.name}" deve ter entre 10 e 15 caracteres</p>`)
                    }
                }
                //imprimir os erros
                for (const erro of erros) {
                    listaErros.innerHTML += "<li>" + erro + "</li>";
                }
                //let inputNome = document.querySelector('input[name="name"]');
                //console.log(inputNome.value);
                // let inputNome = document.getElementsByName('name'); tb funciona
                // console.log(inputNome[0].value);
            }
        }
    });
})