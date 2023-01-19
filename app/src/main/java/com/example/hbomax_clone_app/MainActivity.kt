package com.example.hbomax_clone_app

import android.os.Bundle
import android.view.WindowManager
import androidx.appcompat.app.AppCompatActivity
import com.denzcoskun.imageslider.ImageSlider
import com.denzcoskun.imageslider.constants.ScaleTypes
import com.denzcoskun.imageslider.models.SlideModel

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportActionBar?.hide()
        setContentView(R.layout.activity_main)

        val imageList = ArrayList<SlideModel>()
        imageList.add(SlideModel("https://meups.com.br/wp-content/uploads/2022/11/Serie-de-The-Last-of-Us-3.jpg", " "))
        imageList.add(SlideModel("https://blogger.googleusercontent.com/img/b/R29vZ2xl/AVvXsEiYoR7cVBlQSQF4GNgK3Apu7HZ64nDLs8e516md6-3aDriDdnrlnZ4_yb_nZ5dPklFgJsobluIbsCzowtLvoTmS3bj1z_spYOal-zpRbzcH8-FT4h-RjPyVnTiNUQY0Ow_PvUHLb2CameQG_pobknPWJ_kzu4Hf-4CeMQv-GN2U3sfPSwvcfExsZr21OA/s800/blckadm02.jpg", " "))
        imageList.add(SlideModel("https://image.tmdb.org/t/p/w500/8KdHdOAP8mM4TmykkXnpr6qkyUU.jpg", " "))
        imageList.add(SlideModel("https://conteudo.imguol.com.br/c/entretenimento/bc/2022/06/22/poster-oficial-de-house-of-the-dragon-1655915054477_v2_3x4.jpg", " "))

        val imageSlider = findViewById<ImageSlider>(R.id.viewPagerMain)
        imageSlider.setImageList(imageList, ScaleTypes.CENTER_CROP)

    }

}