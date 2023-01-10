console.log('Hej "citat"');
console.log("Hej 'citat'");

const name = 'Bob Ross';
const greeting = `Hello, ${name}`;
console.log(greeting);

const multipleLines = `rad
rad
rad`
console.log(multipleLines);

const calc = `Two plus two equals to ${2+2}`;
console.log(calc);

const amount = 100;
for (let i=0; i<amount; i++) {
    const p = document.createElement('p');
    document.body.append(p);

    const hue = 40+(40*i/(amount-1));
    p.style.background = `hsl(${hue}, 90%, 60%)`;
    console.log(hue);
    p.innerText = i;
    
}