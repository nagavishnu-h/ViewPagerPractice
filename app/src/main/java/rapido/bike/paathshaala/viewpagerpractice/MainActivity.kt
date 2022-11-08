package rapido.bike.paathshaala.viewpagerpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayoutMediator

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initialiseTabs()
    }

    private fun initialiseTabs(){
        val tabTitle = arrayListOf<String>("TAB1", "TAB2", "TAB3")
        val pager = findViewById<ViewPager2>(R.id.viewPager2)
        val tabMenu = findViewById<TabLayout>(R.id.tabLayout)
        pager.adapter = MyAdapter(supportFragmentManager, lifecycle, tabTitle)

    }
}