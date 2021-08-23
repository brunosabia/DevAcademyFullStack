let btnMore = document.querySelector('main.container button#more');
let btnHeart = document.querySelector('main.container .likes img');
let search = document.querySelector('header .container .busca form');
let container = document.querySelector('main.container #post');
let parentDiv = document.querySelector('main.container')
let stop = document.querySelector('main.container .stop')

//console.log(search);
//console.log(btnHeart);
console.log(btnMore);

//ex 1
btnMore.onclick = (event) => {
    container.nextElementSibling;
    let newPost = container.cloneNode(true);
    parentDiv.insertBefore(newPost, stop);
}

//ex 2
btnHeart.onclick = (event) => {
        event.target.nextElementSibling;
    if (btnHeart.getAttribute('src') == "img/icons/heart.svg") {

        btnHeart.src = "img/red-heart.png";
        btnHeart.nextElementSibling.innerHTML = '1 like'

    } else {
        btnHeart.src = "img/icons/heart.svg";
        
        btnHeart.nextElementSibling.innerHTML = '0 like'
    }
}

//ex 3
search.onmouseover = (event) => {
    search.style.cssText = "box-shadow:0px 1px 3px black;";
}
search.onmouseleave = (event) => {
    search.style.cssText = "box-shadow:0px;";
}


//ex 4
btnMore.onmouseover = (event) => {
    btnMore.style = "cursor:pointer"
}

