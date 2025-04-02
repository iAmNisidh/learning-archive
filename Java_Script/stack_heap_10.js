console.log("stack heap");
// stack used in primitive  heap usead in nnon primitve
// in stack we get a copy and in heap we get reference
let name= "nisidh";
console.log(name);

let anotherName= name
anotherName= "Tannu"
console.log(anotherName);
console.log(name);
let user1= {
    email: "abc@gmail.com",
    upi: "nisidh@ybl"

}

let user2= user1
user2.email="Nisidh@gamil.com"
console.log(user1.email);
console.log(user2.email);

