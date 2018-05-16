package sksolutions.k.stepan.sk_solutions

import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v7.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_base.*




enum class navigationItemOption(val sectionItem: Int){
    BLOG(0),
    STUFF(1),
    WORK(2)
}

enum class BLOG{

}






class BaseActivity : AppCompatActivity() {

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener { item ->
        when (item.itemId) {
            R.id.navigation_blog -> {
                message.setText(R.string.title_tab_blog)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_stuff -> {
                message.setText(R.string.title_tab_stuff)
                return@OnNavigationItemSelectedListener true
            }
            R.id.navigation_work -> {
                message.setText(R.string.title_tab_work)
                return@OnNavigationItemSelectedListener true
            }
        }
        false
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_base)

        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)
    }







    fun setMainContainerView(){



    }
}
