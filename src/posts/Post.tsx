import { useParams } from "react-router-dom";
import { postsMap } from "./PostCard";
import ReactMarkdown from "react-markdown";
import { useEffect, useState } from "react";
import './postPage.css';

export const PostDetail = () => {
  const { id } = useParams(); // Get the 'id' parameter from the URL
  const [markdownContent, setMarkdownContent] = useState('');
  useEffect(() => {
    fetch(postsMap[id || ""])
      .then(response => response.text())
      .then(text => setMarkdownContent(text))
      .catch(err => console.error('Error fetching markdown:', err));
  }, [id]);
  return <div className="postPage">
    <ReactMarkdown children={markdownContent} />
  </div>
};