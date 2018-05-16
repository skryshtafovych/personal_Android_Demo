package sksolutions.k.stepan.sk_solutions

import android.app.Fragment
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.activity_base.*

class personal_blog_Fragment: Fragment() {

    //3
    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?,
                              savedInstanceState: Bundle?): View? {
        return inflater?.inflate(R.layout.personal_blog_fragment, container, false)
    }

}