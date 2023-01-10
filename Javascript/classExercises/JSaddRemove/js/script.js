const p = document.createElement('p');

document.body.prepend(p);
p.innerText = 'Nu bör det synas!';

const list = document.createElement('ol');
document.body.append(list);

const item1 = document.createElement('li');
item1.innerText = 'item1';
list.append(item1);

const item2 = document.createElement('li');
item2.innerText = 'item2';
list.append(item2);

item1.remove();

const div = document.createElement('div');
document.body.append(div);

const ul = '<ul> <li>Lenny</> <li>Jimmy</></ul>';
div.innerHTML = ul;

// Math Random
const random = Math.random();
console.log(random);

const randomHundred = random*100;
console.log(randomHundred);

const randomRounded = Math.round(randomHundred);
console.log(randomRounded);

console.log(2*'3');