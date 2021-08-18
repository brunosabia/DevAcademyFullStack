console.log('Arquivo externo lido!');


let btnToggleTheme = document.querySelector('header .container .buttons .toggleTheme');
console.log(btnToggleTheme);
let body = document.querySelector('body');
let iframe = document.querySelector('iframe');


//Arrow Function
btnToggleTheme.onclick = (event) => {
    //alternando classe no elemento body
    body.classList.toggle('dark-theme');
    

}


    //EXEMPLO IF TERNÁRIO
    // let cafeDaManha = false;
    // console.log((cafeDaManha) ? 'To de bom humor' : 'Sem tempo, irmão!');
 