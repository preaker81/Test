let name = "jimmy";
console.log(name);

name = "jenny";
console.log(name);

console.log(typeof name);

const age = 36;
console.log(age);

const newName = name;
name = "karlsson";
console.log(newName, name);

const arrayNumbers = [3, 5, 7, 9, 11, 13];
console.log(arrayNumbers);
arrayNumbers[3] = age;
console.log(arrayNumbers);
// arrayNumbers = age;

const arrayLetters = arrayNumbers;
console.log(arrayLetters, arrayNumbers);

arrayLetters[0] = 'a';
console.log(arrayLetters, arrayNumbers);