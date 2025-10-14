import { useParams } from "react-router-dom";

export const PostDetail = () => {
  const { id } = useParams(); // Get the 'id' parameter from the URL
  return <h2>Post Detail Page - Post ID: {id}</h2>;
};