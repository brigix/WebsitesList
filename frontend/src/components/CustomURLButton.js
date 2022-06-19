import React from "react";
import { Button } from "@mui/material";
import Launch from "@mui/icons-material/Launch";

const CustomURLButton = (props) => {
	let url = "";
	if (!props.url.url.includes("http")) {
		url = "http://" + props.url.url;
	} else {
		url = props.url.url;
	}
	let formattedUrl = url.replace("https://", "").replace("http://", "");

	return (
		<a href={url} target="_blank" rel="noreferrer" textDecoration="none">
			<Button
				endIcon={<Launch />}
				value={props.url.url}
				width="200px"
				variant="text"
			>
				{formattedUrl}
			</Button>
		</a>
	);
};

export default CustomURLButton;
