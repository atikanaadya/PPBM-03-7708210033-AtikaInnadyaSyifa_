package com.example.nad

object Data {
    val regulerList: List<Reguler>
        get() {
            val regulerList: MutableList<Reguler> = ArrayList()
            val Lima = Reguler()
            Lima.name = "5jam"
            regulerList.add(Lima)
            val sehari = Reguler()
            sehari.name = "Sehari Jadi"
            regulerList.add(sehari)
            val dua = Reguler()
            dua.name = "2 Hari"
            regulerList.add(dua)
            return regulerList
        }
}
