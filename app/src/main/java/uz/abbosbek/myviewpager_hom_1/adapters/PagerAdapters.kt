package uz.abbosbek.myviewpager_hom_1.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.viewpager.widget.PagerAdapter
import uz.abbosbek.myviewpager_hom_1.databinding.ItemRvBinding
import uz.abbosbek.myviewpager_hom_1.modls.User

class PagerAdapters(val list: ArrayList<User>, val context: Context):PagerAdapter(){
    override fun getCount(): Int = list.size

    override fun isViewFromObject(view: View, `object`: Any): Boolean {
    return view == `object`
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {
        val itemRvBinding = ItemRvBinding.inflate(LayoutInflater.from(container.context), container, false)

        itemRvBinding.tvImage.setImageResource(list[position].image)
        itemRvBinding.tvText.text = list[position].title_1
        itemRvBinding.tvText2.text = list[position].title_2

//        itemRvBinding.btn.setOnClickListener {
//            Toast.makeText(context, "btn bosildi", Toast.LENGTH_SHORT).show()
//        }

        container.addView(itemRvBinding.root)
        return itemRvBinding.root
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object`as View)
    }
}