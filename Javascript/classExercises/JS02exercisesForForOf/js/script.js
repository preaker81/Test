const ol = document.createElement('ol');
document.body.append(ol);

for (let index = 0; index < 10; index++) {
    const li = document.createElement('li');
    ol.append(li);
}

const liAll = document.querySelectorAll('li');
let border = 1;
for(let i = 0; i < liAll.length; i++){
    liAll[i].style.border = `${border}px solid black`;
    border++;
}

const random = Math.round(Math.random()+1)*20;
console.log(random);

for(i = 0; i < random; i++){
    const h1 = document.createElement('h1');
    h1.innerText = `Random h1: ${i+1}`;
    h1.style.background = `hsl(${Math.round(Math.random()*255)}, 90%, 60%)`
    document.body.append(h1);
}

for(i = 0; i < random; i++){
    const p = document.createElement('p');
    p.innerText = `Random Paragraph: ${i+1}`;
    p.style.background = `hsl(360, 0%, ${100 -(i*5)}%)`
    p.style.color = `hsl(360, 0%, ${i*5}%)`
    document.body.append(p);
}

const h1All = document.querySelectorAll('h1');
for(i = 0; i< h1All.length; i++){
    h1All[i].innerText = `${i+1}`;
}

