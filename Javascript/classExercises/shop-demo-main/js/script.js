// const h3 = document.querySelector('h3');
// console.log(h3);

// const h3All = document.querySelectorAll('h3');
// console.log(h3All);

// const art3 = document.querySelector('.art-3');
// console.log(art3);

// const art3All = document.querySelector('.art-3');
// console.log(art3All[0]);

// h3.innerText = "potato";

// h3All[1].innerText = 'Vad kommer hända?';

// art3.innerHTML = '<h1>Ny rubrik</h1>';
// // art3.innerText = '<h1>Ny rubrik</h1>';

// const h1 = document.querySelector('.art-3 h1');
// console.log(h1);

// h1.style.color = 'hotpink';
// h1.style.fontWeight = '500';

// const img = document.querySelector('img');
// img.src = 'https://place.dog/300/200';

// const art2P = document.querySelector('.art-2 p');
// art2P.style.backgroundColor = 'blue';

// const section = document.querySelector('section');
// section.classList.add('red');




// 1
// Byt texten för första hoodien från Ash till Potato. 
// document.querySelector('article').classList.remove('art-1');

// 2
// Byt text för  Home till Start
document.querySelector('nav a').innerText ='Start';

// 3
// Byt text för Contact till Mail Us.
const contact = document.querySelectorAll('a');
console.log(contact);
contact[5].innerText = 'Mail Us';

// 4
// Byt ut texten i paragrafen under Fire-hoodien.
document.querySelector('.art-2 p').innerText = 'Denna text är utbytt';

// 5
// Byt ut adressen i footern.
document.querySelector('footer article p').innerHTML = '<h3>Where we are</h3><p>Sinus skateboards <br>Valheim 666 <br>666 66, Hel</p>';

// 6
// Ändra text på samtliga knappar till add to cart.
const button = document.querySelectorAll('button');
for(let i = 0; i < button.length; i++){
    button[i].innerText = 'add to cart.';
}

// 7
// Ändra HTML-innehållet i nav till en länk med texten HOME
document.querySelector('nav').innerHTML = '<a href="#">Home</a>';

// 8
// Byt ut allt HTML-innehåll i andra articeln till en img med nick cage.
document.querySelector('.art-2').innerHTML = '<img src="https://place.dog/300/200" alt="doggo">';



// Ändra attribut 1
// Byt ut bilden på första hoodien till en place-kitten bild. 
document.querySelector('.art-1 figure img').src = 'http://placekitten.com/200/300';

// Ändra attribut 2
// Byt ut bilden på andra hoodien till en place-puppy bild.

// Ändra attribut 3
// Byt ut bilden på tredje hoodien till hoodie-forest (finns i img-mappen)




// Ändra CSS 1
// Byt bakgrundsfärg på första knappen.
document.querySelector('button').style.backgroundColor = 'hotpink';

// Ändra CSS 2
// Byt bakgrundsfärg på tredje article av produkterna.
const article = document.querySelectorAll('article')
article[2].style.backgroundColor = 'orange';

// Ändra CSS 3
// Byt text-färg på samtliga paragrafer.
const p = document.querySelectorAll('p');
for(let i = 0; i<p.length; i++){
    p[i].style.color = 'red';
}

//  Ändra CSS 4
// Lägg till klassen active på menyalternativet home. (Menyn i footern)
const aActive = document.querySelectorAll('footer a');
console.log(aActive);
aActive[0].classList.add('active');

// Ändra CSS 5
// Ta bort klassen logo på logotypen.
document.querySelector('.logo').classList.remove('logo');

// Ändra CSS 6
// Ändra bredden på alla img i articles till 50%
const img50Percent = document.querySelectorAll('img');
for(let i = 0; i<img50Percent.length; i++){
    img50Percent[i].style.width = '50%';
}

// Ändra CSS 7
// Skriv stilregler i CSS-filen för en klass som ger en border som är solid 2px bred och gul. Lägg till klassen på alla p-element.
const yellowBorder = document.querySelectorAll('p');
for(let i = 0; i<yellowBorder.length; i++){
    yellowBorder[i].classList.add('excercise8');
}

// Ändra CSS 8
// Ändra fonten för alla element i footern till Times New Roman.
const footerAll = document.querySelectorAll('footer');
for(let i = 0; i<footerAll.length; i++){
    footerAll[i].style.fontFamily = 'Times New Roman';
}