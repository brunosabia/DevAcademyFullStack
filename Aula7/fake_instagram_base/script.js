console.log('Arquivo externo vinculado!')

//alert('Olá, usuário!')

let  divUsuario = document.querySelector('header .avatar-content div')
//console.log('divUsuario');


//lá no console do navegador, utilizar o divUsuario.innerText para pegar o texto que está dentro da tag selecionada

divUsuario.innerText ='Maestro'
divUsuario.innerText += '.Billy'

//selecionar input
let inputNome = document.getElementsByName('name');
let inputSobrenome = document.getElementsByName('surname');

//console.log(inputNome, inputSobrenome);

//let inputNome = document.querySelectorAll('form input')[1];

inputNome[0].placeholder = 'Digite seu nome';
inputSobrenome[0].placeholder='Digite seu sobrenome';

let body = document.querySelector('body');
//console.log(body);
body.style.backgroundColor='#FAFAFA';

let input = document.querySelectorAll('form.form-auth input');
//console.log(formInput);
for(let i = 0; i < input.length; i++) {
    input[i].style.cssText = "box-sizing: border-box; width:100%; border-radius: 4px; "
}

let button = document.querySelector('form.form-auth button');
button.style.width='100%';
button.style.borderRadius='4px';

//console.log(button);
//let logo = document.querySelector('form.form-auth #logo img');
//logo.style.marginLeft='10%'
//console.log(logo);
