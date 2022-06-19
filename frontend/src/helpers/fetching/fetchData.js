import { fetch } from "./requests";

export const getWebPages = async () => {
	const webPages = await fetch("/webpages");
	return webPages;
};
