import React from "react";
import { Box } from "@mui/material";
import { useStyles } from "../helpers/useStyles";
import Logo from "./Energy-advice-logo.png";

const EnergyAdviceLogo = () => {
    const classes = useStyles();
	return (
		<Box className={classes.logo}>
			<img src={Logo} alt="Energy Advice logo" height="50" />
		</Box>
	);
};

export default EnergyAdviceLogo;
