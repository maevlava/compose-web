import androidx.compose.runtime.Composable
import components.Navbar
import org.jetbrains.compose.web.dom.Div

@Composable
fun App() {
    Div {
        Navbar()
    }
}