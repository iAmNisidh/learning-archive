// primitive  callled by value

// they are 7 in  no :string,Number ,BOolean,null ,undefineed,Symboll, big int


// refferenvce type(Non primitive)

//  array ,objects , functions 
const  score = 288
// for symboll 
const id = Symbol('5612');
const xid = Symbol('5612');
console.log(id===xid);
const temperature= null
const s= 555226541222645878965451236654889652112233668899888888n
// n converts into big int 
const hero = ["nisidh","ironman","hello"];
let myObj = {
    name: "nisidh",
    roll: "S24CSEU1912"

}
const myFn=function(){
    console.log("Nisidh");
    

}
console.log(myFn," Nisidh");
console.log(typeof s);

console.log(typeof temperature); // this  is giving type as an obj  but we give it as null 
