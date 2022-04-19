package com.wew.recyclerviewkotlin

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    companion object{
        val INTENT_PARCELABLE = "OBJECT_INTENT"
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val superherolist = listOf<Superhero>(
            Superhero(
                R.drawable.anggrek,
                nameSuperhero = "Bunga Anggrek",
                descSuperhero = "Suku anggrek-anggrekan merupakan satu suku tumbuhan berbunga dengan anggota jenis terbanyak. Jenis-jenisnya tersebar luas dari daerah tropika basah hingga wilayah sirkumpolar, meskipun sebagian besar anggotanya ditemukan di daerah tropika."
            ),
            Superhero(
                R.drawable.bugenvil,
                nameSuperhero = "Bunga Bugenvil",
                descSuperhero = "Bunga kertas atau bugenvil adalah tanaman hias populer. Bentuknya berupa pohon kecil yang sukar tumbuh tegak. Keindahannya berasal dari seludang bunganya yang berwarna cerah dan menarik perhatian karena tumbuh dengan rimbunnya."

            ),
            Superhero(
                R.drawable.iris,
                nameSuperhero = "Bunga Iris",
                descSuperhero = "Iris adalah sebuah genus dalam famili Iridaceae yang mencakup 260–300 spesies tumbuhan berbunga. Tumbuhan tersebut mengambil nama dari kata bahasa Yunani untuk pelangi, yang juga merupakan nama dari dewi pelangi Yunani, Iris."
            ),
            Superhero(
                R.drawable.mawar,
                nameSuperhero = "Bunga Mawar",
                descSuperhero = "Mawar adalah suatu jenis tanaman semak dari genus Rosa sekaligus nama bunga yang dihasilkan tanaman ini. Mawar liar terdiri dari 100 spesies lebih, kebanyakan tumbuh di belahan bumi utara yang berudara sejuk."
            ),
            Superhero(
                R.drawable.melati,
                nameSuperhero = "Bunga Melati",
                descSuperhero = "Melati merupakan tanaman bunga hias berupa perdu berbatang tegak yang hidup menahun. Melati merupakan genus dari semak dan tanaman merambat dalam keluarga zaitun."
            ),
            Superhero(
                R.drawable.pentas,
                nameSuperhero = "Bunga Pentas",
                descSuperhero = "Pentas lanceolata merupakan salah satu tanaman bunga hias yang berasal dari Afrika Timur sampai Arab Selatan dan salah satu bunga yang rajin berbunga."
            ),
            Superhero(
                R.drawable.petunia,
                nameSuperhero = "Bunga Petunia",
                descSuperhero = "Petunia adalah suatu genus tumbuhan berbunga dari famili Solanaceae yang bunganya berbentuk trompet. Tumbuhan ini berasal dari Amerika Selatan. Secara fisik, tinggi tanaman ini antara 16–30 cm, bunganya ada yang bermahkota tunggal dan ada pula yang bermahkota ganda dengan warna yang bervariasi."
            ),
            Superhero(
                R.drawable.sepatu,
                nameSuperhero = "Bunga Kembang Sepatu",
                descSuperhero = "Kembang sepatu adalah tanaman semak suku Malvaceae yang berasal dari Asia Timur dan banyak ditanam sebagai tanaman hias di daerah tropis dan subtropis. Bunga besar, berwarna merah dan tidak berbau."
            ),
            Superhero(
                R.drawable.teratai,
                nameSuperhero = "Bunga Teratai",
                descSuperhero = "Teratai adalah nama genus untuk tanaman air dari suku Nymphaeaceae. Dalam bahasa Inggris dikenal sebagai water-lily atau waterlily. Di Indonesia, teratai juga digunakan untuk menyebut tanaman dari genus Nelumbo."
            ),
            Superhero(
                R.drawable.tulip,
                nameSuperhero = "Bunga tulip",
                descSuperhero = "Tulip merupakan nama genus untuk 100 spesies tumbuhan berbunga yang termasuk ke dalam keluarga Liliaceae. Tulip berasal dari Asia Tengah, tumbuh liar di kawasan pegunungan Pamir dan pegunungan Hindu Kush dan stepa di Kazakhstan. Negeri Belanda terkenal sebagai negeri bunga tulip."
            ),


        )
        val recyclerView = findViewById<RecyclerView>(R.id.rv_hero)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.setHasFixedSize(true)
        recyclerView.adapter = SuperheroAdapter(this, superherolist){
            val intent = Intent (this, DetailSuperheroActivity::class.java)
            intent.putExtra(INTENT_PARCELABLE, it)
            startActivity(intent)

        }
    }
}