const number = 1;
const text = '1';

console.log(number==text);
console.log(number===text);

// Resultatet blir datatypen String
console.log(typeof (number+text), number+text);

// Båda hanteras som number
console.log(number<text);

console.log(number!=text);
console.log(number!==text);


// For loop
const ol = document.createElement('ol');
document.body.append(ol);

for(let i=0; i<10; i++){
    const li = document.createElement('li');
    ol.append(li);
}

// for-of loop
const liElements = document.querySelectorAll('li');
console.log(liElements);
let index = 0;
for( const li of liElements){
    console.log(li);
    li.style.background = 'hotpink';
    if(index%2 == 1){
        li.style.background = 'green';
    }
    index++;
}

let randomNumber = 10;
let times = 0;
while(randomNumber != 0){ 
    randomNumber = Math.round( Math.random()*10 );
    console.log('Random: ', randomNumber, times);
    times++
}