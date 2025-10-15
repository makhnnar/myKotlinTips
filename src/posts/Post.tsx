import { useParams } from "react-router-dom";
import { postsMap } from "./PostCard";
import ReactMarkdown from "react-markdown";
import { useEffect, useState } from "react";

export const PostDetail = () => {
  const { id } = useParams(); // Get the 'id' parameter from the URL
  const [markdownContent, setMarkdownContent] = useState('');
  useEffect(() => {
    fetch(postsMap[id || ""])
      .then(response => response.text())
      .then(text => setMarkdownContent(text))
      .catch(err => console.error('Error fetching markdown:', err));
  }, [id]);
  return <div>
    <h2>Post Detail Page - Post ID: {id}</h2>;
    <ReactMarkdown children={markdownContent} />
  </div>
};