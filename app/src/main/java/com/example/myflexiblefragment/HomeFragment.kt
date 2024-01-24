package com.example.myflexiblefragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.View.OnClickListener
import android.view.ViewGroup
import android.widget.Button

class HomeFragment : Fragment(), View.OnClickListener {
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Layout interface didefinisikan dan ditransformasikan dari layout berupa file xml ke dalam objek view dengan metode inflate()
        return inflater.inflate(R.layout.fragment_home, container, false)
        // Inflater.inflate() merupakan objek dari LayoutInflater yang berfungsi untuk mengubah layout xml ke dalam bentuk objek viewgroup atau widget melalui pemanggilan metode inflate(). Sama seperti setContentView pada Activity, fungsi inflate disini yaitu untuk menampilkan layout dari Fragment, dimana layout yang ditampilakn disini yaitu fragment_home

        // return inflater.inflate(x, y, z)
        // x: Layout yang ingin diubah
        // y: Root dari Layout Activity
        // z: Apakah kita akan menempelkan layout ke dalam root dari parent layout yang ada. Jika ya, maka akan ditempelkan ke dalam parent layout yang ada. Jika tidak, maka hanya akan menghasilkan nilai balik dalam bentuk object view saja. Kita memilih false karena pada kode ini kita ingin menambahkan event onClick pada button-nya. Maka kita membutuhkan nilai balik berupa view.
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        // Metode ini akan bekerja setelah metode "onCreateView()". Disini kita bisa gunakan untuk inisialisasi view, dan juga mengatur option-nya (set-listener)
        super.onViewCreated(view, savedInstanceState)
        val btnCategory: Button = view.findViewById(R.id.btn_category)
        btnCategory.setOnClickListener(this)
    }

    override fun onClick(v: View?) {

    }
}