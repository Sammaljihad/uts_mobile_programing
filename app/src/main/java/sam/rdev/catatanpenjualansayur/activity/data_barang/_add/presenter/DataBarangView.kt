package sam.rdev.catatanpenjualansayur.activity.data_barang.presenter

import sam.rdev.catatanpenjualansayur.model.Barang

interface DataBarangView {
    fun onSuccessDataBarang(data: List<Barang?>?)
    fun onErrorDataBarang(msg: String?)

    fun onSuccessDeleteBarang(msg : String?)
    fun onErrorDeleteBarang(msg : String?)
}