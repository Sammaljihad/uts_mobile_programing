package sam.rdev.catatanpenjualansayur.activity.report.presenter

import sam.rdev.catatanpenjualansayur.model.Keranjang

interface ReportView {
    fun onSuccessReport(keranjang: List<Keranjang?>?)
    fun onFailedReport(localizedMessage: String?)

    fun onSuccessRestore(msg: String?)
    fun onFailedRestore(msg: String?)
}