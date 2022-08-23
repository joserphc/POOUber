class Driver extends Account {
    constructor(name, document, email, password){
        super(name, document, email, password)
        this.name = name;
        this.document = document;
        this.email = email;
        this.password = password;
    }
}