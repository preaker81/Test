// if / switch 1
const fruits = ['Apelsin', 'Ananas', 'Lingon', 'Banan', 'Äpple', 'Mandarin'];
console.log(fruits);

for (i = 0; i < fruits.length; i++) {
    const h1Fruit = document.createElement('h1');
    h1Fruit.innerText = fruits[i];
    document.body.append(h1Fruit);

    switch (fruits[i]) {
        case 'Apelsin':
        case 'Mandarin':
            h1Fruit.style.background = 'orange';
            break;

        case 'Ananas':
        case 'Banan':
            h1Fruit.style.background = 'yellow';
            break;

        case 'Lingon':
            h1Fruit.style.background = 'red';
            break;

        case 'Äpple':
            h1Fruit.style.background = 'green';
            break;
    }
}

// if / switch 2
const weekday = ['Monday', 'Tuesday', 'Wednesday', 'Tursday', 'Friday', 'Saturday', 'Sunday'];
const random = Math.round(Math.random()*6);
console.log(random);

const h1 = document.createElement('h1');
h1.innerText = weekday[random];
if (random === 5 || random === 6){
    h1.style.background = 'hotpink';
}else{
    h1.style.background = 'grey';
}
document.body.append(h1);

// if / switch 3
const animals = ['rat', 'monkey', 'hare', 'horse', 'giraffe'];
for(let i = 0; i < animals.length; i++){
    console.log(animals[i]);
    const p = document.createElement('p');
    p.innerText = animals[i];
    if(animals[i].length > 5){
        p.style.fontWeight = '1000';
    }
    document.body.append(p);
}

// if / switch 4
const names = ['jimmy', 'karim', 'ida', 'kelly', 'clara', 'max'];
for(let i = 0; i < names.length; i++){
    const pNames = document.createElement('p');
    pNames.innerText = `${names[i]}`;
    document.body.append(pNames);

    switch (i%3){
        case 0:
            pNames.style.background = 'white';
            break;
        case 1:
            pNames.style.background = 'lightblue';
            break;
        case 2:
            pNames.style.background = 'blue';
            break;
    }
}

// if / switch 5

for(let i = 0; i < 5; i++){
    const pRandom = document.createElement('p');
    pRandom.innerText = `${Math.round(Math.random()*20)}`;
    if(pRandom.innerText <= 10){
        pRandom.style.fontSize = 'x-large';
    }else
    pRandom.style.fontSize = 'small';

    if(pRandom.innerText == 15){
        pRandom.style.color = 'red';
    }
    document.body.append(pRandom);
}