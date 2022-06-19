import React from "react";
import AppBar from "@material-ui/core/AppBar";
import Toolbar from "@material-ui/core/Toolbar";
import IconButton from "@material-ui/core/IconButton";
import { Menu } from "@mui/icons-material";
import { useStyles } from "../helpers/useStyles";
import EnergyAdviceLogo from "../resources/EnergyAdviceLogo";

const AppBarHeader = () => {
	const classes = useStyles();
	return (
		<div className={classes.root}>
			<AppBar position="static">
				<Toolbar>
					<IconButton
						edge="start"
						className={classes.menuButton}
						color="inherit"
						aria-label="open drawer"
					>
						<Menu />
					</IconButton>
					<EnergyAdviceLogo />
					
				</Toolbar>
			</AppBar>
		</div>
	);
};

export default AppBarHeader;
