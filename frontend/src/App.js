import "./App.css";
import { ThemeProvider } from "@material-ui/styles";
import { theme } from "./helpers/theme";
import WebPageListContainer from "./components/WebPageListContainer";
import AppBarHeader from "./components/AppBarHeader";

function App() {
	return (
		<ThemeProvider theme={theme}>
			<AppBarHeader />
			<WebPageListContainer />
		</ThemeProvider>
	);
}

export default App;
