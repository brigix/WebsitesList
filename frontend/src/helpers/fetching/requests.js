import axios from "axios";

import { API_BASE_URL } from "./constants";

export async function fetch(query) {
	try {
		console.log(`${API_BASE_URL}${query}`);
        const response = await axios.get(`${API_BASE_URL}${query}`);
		return response.data;
	} catch (error) {
		return handleError(error);
	}
}

function handleError(error) {
	throw new Error(error);
}
