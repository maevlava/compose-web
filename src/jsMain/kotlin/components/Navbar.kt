package components

import androidx.compose.runtime.Composable
import org.jetbrains.compose.web.attributes.href
import org.jetbrains.compose.web.css.Style
import org.jetbrains.compose.web.dom.A
import org.jetbrains.compose.web.dom.Div
import org.jetbrains.compose.web.dom.H3
import org.jetbrains.compose.web.dom.Text
import styles.NavbarStyles

@Composable
fun Navbar() {
    Style(NavbarStyles)
    NavbarContainer {
        Name()
        Links()
        Signs()
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

@Composable
fun Name() {
    H3(
        attrs = {
            classes(NavbarStyles.name)
        }
    ) {
        Text("Raffael Ali Maulana")
    }
}

@Composable
fun Links() {
    Div() {
        A(
            attrs = {href("#")}
        ) {
            Text("Home")
        }
        A(
            attrs = {href("#")}
        ) {
            Text("About")
        }
        A(
            attrs = {href("#")}
        ) {
            Text("Work")
        }
    }
}

@Composable
fun Signs() {
    Div() {
        A(
            attrs = {href("#")}
        ) {
            Text("Sign in")
        }
        A(
            attrs = {href("#")}
        ) {
            Text("Sign Out")
        }
    }
}