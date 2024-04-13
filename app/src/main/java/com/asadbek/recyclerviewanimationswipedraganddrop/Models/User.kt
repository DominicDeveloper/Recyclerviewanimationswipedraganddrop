package com.asadbek.recyclerviewanimationswipedraganddrop.Models

class User {
    var id:Int? = null
    var userName:String? =null
    var password:String? = null
    constructor()
    constructor(id: Int?, userName: String?, password: String?) {
        this.id = id
        this.userName = userName
        this.password = password
    }

}