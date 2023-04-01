package styles

import org.jetbrains.compose.web.css.*

object NavbarStyles : StyleSheet() {
    val container by style {
        display(DisplayStyle.Flex)
        flexDirection(FlexDirection.Row)
        justifyContent(JustifyContent.SpaceBetween)
    }
    val name by style {
        margin(0.px)

        fontSize(1.5.em)
        fontStyle("Bold")
        fontFamily("Poppins")

        color(Color.red)
    }
}