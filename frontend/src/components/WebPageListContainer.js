import React from "react";
import { Container } from "@material-ui/core";
import WebPageDataGrid from "./WebPageDataGrid";
import { useStyles } from "../helpers/useStyles";

const WebPageListContainer = () => {
  const classes = useStyles();

  return (
		<Container className={classes.mainContainer}>
			<WebPageDataGrid />
		</Container>
	);
};

export default WebPageListContainer;
