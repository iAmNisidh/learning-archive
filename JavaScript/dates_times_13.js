let myDate = new Date();
console.log(myDate);
console.log(myDate.toDateString());
console.log(myDate.toString());
console.log(myDate.getDate());
console.log(myDate.getFullYear());
console.log(myDate.getTimezoneOffset());
console.log(myDate.toISOString());
console.log(myDate.toJSON());
console.log(myDate.toUTCString());
console.log(typeof myDate);

let myCreatedDate= new Date(9029,15,99,8,59,789,56);
console.log(myCreatedDate);
console.log(myCreatedDate.toDateString());
let myTimeStamp = Date.now();
console.log(myTimeStamp);
console.log(myCreatedDate.getTime());
console.log(Date.now()/600000);

let newDate = new Date()
console.log(newDate.getHours());
newDate.toLocaleString('default',{
    weekday:"short"


})



