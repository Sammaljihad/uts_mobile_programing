package sam.rdev.catatanpenjualansayur.activity.penjualan.data

import javax.annotation.Generated
import com.google.gson.annotations.SerializedName
import sam.rdev.catatanpenjualansayur.model.Barang

@Generated("com.robohorse.robopojogenerator")
data class ResultSearchBarang(

	@field:SerializedName("barang")
	val barang: List<Barang?>? = null,

	@field:SerializedName("message")
	val message: String? = null,

	@field:SerializedName("status")
	val status: Int? = null
)