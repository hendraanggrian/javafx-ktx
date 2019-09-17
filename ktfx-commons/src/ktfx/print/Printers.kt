package ktfx.print

import javafx.print.JobSettings
import javafx.print.Printer
import javafx.print.PrinterJob

val defaultPrinter: Printer
    get() = checkNotNull(Printer.getDefaultPrinter()) { "Default printer not found." }

fun Printer.createJob(
    name: String? = null,
    settings: JobSettings.() -> Unit = {
        if (name != null) jobName = name
        copies = 1
        setPageRanges(1 untilPage 1)
    }
): PrinterJob = PrinterJob.createPrinterJob(this).also { settings(it.jobSettings) }