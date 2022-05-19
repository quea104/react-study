console.log('Hello World');

// const (immutable) vs. let (mutable)
const myNumber = 3.14;

// myNumber = 5;

const myArray = [1,2,3,4,5];
myArray.push(6);

const myObj = {
  id: 1,
  title: 'good morning',
  body: '본문입니다.',
};

myObj.likes = 5

console.log(myObj);

/*****************************************/

// Arrow functions, 화살표 함수
function addTwoNumber(a=0, b=0) {
    return a+b;
}

const subTwoNumbers = function(a, b) {
    return a-b;
};

const result = addTwoNumber(b=3, a=5);
const result2 = subTwoNumbers(b=5, a=3);

// 화살표 함수 -> React에서 많이 사용
const multiplyTwoNumbers = (a, b) => {
    return a*b;
};

const multiplyTwoNumbers2 = a => a*1;

/*****************************************/

// class vs object
// Data - article, post, todo, product

// class 없이 object 생성 가능 <- JavaScript 가장 큰 특징
const myTodo = {
    id: 1,
    title: 'myTodo',
    completed: false
};

// ES6 에서 class 개념 추가

const myArray2 = [1,2,3,4];
const newArray2 = [5,6];

console.log(myArray2 + newArray2);

// spread operator
const myArray3 = [1,2,3,4];
const newArray3 = [...myArray3, 5,6];

console.log(newArray3);

const myObject = {
    name: 'Kim',
  };
  
const newObject = {
...myObject,
age: 40,
};

console.log(newObject);
  
  
const myArray4 = [1,2,3];
const a = myArray[0];
const b = myArray[1];
const c = myArray[2];

const [d, e, f, g] = myArray4; // g -> undefined

console.log(d);
const myObj = {
	name: 'Kim',
  age: 40,
};

//const name = myObj.name;
//const age = myObj.age;

const { name, age, body } = myObj;

