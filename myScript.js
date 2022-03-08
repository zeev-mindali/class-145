function sayHello(){
    alert("Hello Alon the king");
}

class Class145{
    constructor(studentName, studentAge){
        this.studentName=studentName;
        this.studentAge=studentAge;
    }

    age(){
        let date=new Date();
        return date.getUTCFullYear()-this.studentAge;
    }

    whenBe(desiredAge){
        let date=new Date();
        return date.getFullYear()-this.studentAge+desiredAge;
    }


    //wannaBe=(newAge)=>new Date().getFullYear-this.studentAge+newAge;
}

let barak = new Class145("barak",27);
let tomer = new Class145("Tomer",32);

console.log(barak.age());
console.log(barak.whenBe(40));
console.log(tomer.age());
console.log(tomer.wannaBe(50));

console.log(typeof barak);