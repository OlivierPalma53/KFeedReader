package com.example.olivierpalma.kfeedreader

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import com.pkmmte.pkrss.Article
import com.pkmmte.pkrss.Callback
import com.pkmmte.pkrss.PkRSS

class MainActivity : AppCompatActivity(), Callback{

    val listItens = arrayListOf<Item>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        PkRSS.with(this).load("https://rss.tecmundo.com.br/feed").callback(this).async()
    }

    override fun onLoadFailed() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onPreload() {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onLoaded(newArticles: MutableList<Article>?) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    data class Item(val titulo: String, val autor: String, val data: Long, val imagem: String)

}
