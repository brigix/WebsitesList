import { makeStyles } from "@material-ui/core/styles";

export const useStyles = makeStyles((theme) => ({
	root: {
		flexGrow: 1,
	},
	menuButton: {
		marginRight: theme.spacing(2),
	},
	title: {
		flexGrow: 1,
		display: "none",
		fontWeight: "600",
		[theme.breakpoints.up("sm")]: {
			display: "block",
		},
	},
	mainContainer: {
		margin: "10px",
		maxWidth: "md",
		display: "flex",
		flexDirection: "column",
		justifyContent: "center",
		alignItems: "center",
	},
	logo: {
		borderRight: "1px solid #106EEA",
		marginLeft: "10px",
		paddingRight: "30px",
	},
}));
