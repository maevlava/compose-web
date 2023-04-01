package components

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.css.Style
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.Text
import styles.NavbarStyles

@Composable
fun Navbar() {
    Style(NavbarStyles)
    NavbarContainer {
        A() {
            Text("Raffael Ali Maulana")
        }
    }
}

@Composable
fun NavbarContainer(content: @Composable () -> Unit) {
    Div(
        attrs = { classes(NavbarStyles.container)}
    ) {
        content()
    }
}