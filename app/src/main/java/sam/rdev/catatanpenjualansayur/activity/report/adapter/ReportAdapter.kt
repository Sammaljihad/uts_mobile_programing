package sam.rdev.catatanpenjualansayur.activity.report.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import sam.rdev.catatanpenjualansayur.R
import sam.rdev.catatanpenjualansayur.model.Keranjang
import sam.rdev.catatanpenjualansayur.model.KeranjangStatus
import sam.rdev.catatanpenjualansayur.utils.Uang
import kotlinx.android.synthetic.main.item_report.view.*

class ReportAdapter(val listKeranjang: List<Keranjang?>?, val onClick: OnClick?) : RecyclerView.Adapter<ReportAdapter.MyHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_report, parent, false)
        return MyHolder(v)
    }

    override fun getItemCount(): Int = listKeranjang?.size ?: 0

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        holder.bind(listKeranjang?.get(position))
        holder.itemView.imReportModify.setOnClickListener {
            onClick?.restore(listKeranjang?.get(position))
        }
        holder.itemView.setOnClickListener {
            onClick?.click(listKeranjang?.get(position), position)
        }
    }

    class MyHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        fun bind(keranjang: Keranjang?) {
            itemView.tvReportDate.text = keranjang?.date?.substring(0..9)
            itemView.tvReportStatus.text = keranjang?.status
            itemView.tvReportTotalHarga.text = Uang.indonesia(keranjang?.totalHarga ?: 0.0)
            itemView.imReportModify.visibility = if (keranjang?.status == KeranjangStatus.PENDING.status) {
                View.INVISIBLE
            } else {
                View.VISIBLE
            }
        }

    }

    interface OnClick {
        fun restore(keranjang: Keranjang?)
        fun click(keranjang: Keranjang?, position: Int)
    }
}