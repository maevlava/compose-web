package styles

import org.jetbrains.compose.web.css.*

object NavbarStyles : StyleSheet() {
    val container by style {
        display(DisplayStyle.Flex)
        padding(20.px)

        // custom property (or not supported out of a box)
        property("font-family", "Arial, Helvetica, sans-serif")
    }
}