package uz.hamroev.mediatsiyanizolarinihaletish.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import androidx.recyclerview.widget.RecyclerView
import uz.hamroev.mediatsiyanizolarinihaletish.R
import uz.hamroev.mediatsiyanizolarinihaletish.databinding.ItemMenuBinding
import uz.hamroev.mediatsiyanizolarinihaletish.model.MyMenu

class MyMenuAdapter(
    var context: Context,
    var list: ArrayList<MyMenu>,
    var onMyMenuItemClickListener: OnMyMenuItemClickListener
) :
    RecyclerView.Adapter<MyMenuAdapter.VhMenu>() {


    lateinit var anim: Animation
    inner class VhMenu(var itemMenuBinding: ItemMenuBinding) :
        RecyclerView.ViewHolder(itemMenuBinding.root) {

        fun onBind(myMenu: MyMenu, position: Int) {
            anim = AnimationUtils.loadAnimation(context, R.anim.anim_rv1)
            itemMenuBinding.titleMenu.text = myMenu.title_menu
            myMenu.img?.let { itemMenuBinding.imgMenu.setImageResource(it) }
            when (position) {
                8 -> {
                    itemMenuBinding.titleMenu.textSize = 11.0F
                }
                10 -> {
                    itemMenuBinding.titleMenu.textSize = 11.0F
                }
            }
            itemMenuBinding.root.setOnClickListener {
                onMyMenuItemClickListener.onMyClick(myMenu, position)
            }

            itemMenuBinding.root.startAnimation(anim)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VhMenu {
        return VhMenu(ItemMenuBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun onBindViewHolder(holder: VhMenu, position: Int) {
        return holder.onBind(list[position], position)
    }

    override fun getItemCount(): Int {
        return list.size
    }

}

interface OnMyMenuItemClickListener {
    fun onMyClick(myMenu: MyMenu, position: Int)
}