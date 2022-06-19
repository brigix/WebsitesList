import React from "react";
import { useQuery } from "react-query";
import { DataGrid } from "@mui/x-data-grid";
import { Container } from "@mui/material";
import { useStyles } from "../helpers/useStyles";
import { getWebPages } from "../helpers/fetching/fetchData";
import PageLoader from "./PageLoader";
import CustomURLButton from "./CustomURLButton";

const WebPageDataGrid = () => {
	const classes = useStyles();
	const { data, isLoading } = useQuery("webPages", getWebPages);
	if (isLoading) {
		return <PageLoader />;
	}
	const webPagesList = data;

	const rows = webPagesList.map((wp) => ({
		id: wp.id,
		logo: wp.logo,
		title: wp.title.toUpperCase(),
		url: { title: wp.title, url: wp.url },
	}));
	const columns = [
		{
			field: "logo",
			headerName: "LOGO",
			sortable: false,
			width: 200,
			minWidth: 100,
			flex: 1,
			renderCell: (params) => (
				<img
					src={params.value}
					objectfit="contain"
					maxwidth="150px"
					height="30px"
					alt="logo"
				/>
			),
		},
		{
			field: "title",
			headerName: "WEBSITE",
			width: 200,
			minWidth: 100,
			flex: 1,
		},
		{
			field: "url",
			headerName: "LINK TO",
			sortable: false,
			minWidth: 100,
			flex: 2,
			renderCell: (params) => <CustomURLButton url={params.value} />,
		},
	];

	return (
		<Container style={{ height: "80vh" }} className={classes.mainContainer}>
			<DataGrid
				rows={rows}
				columns={columns}
				pageSize={10}
				rowsPerPageOptions={[10]}
				disableSelectionOnClick
			/>
		</Container>
	);
};

export default WebPageDataGrid;
