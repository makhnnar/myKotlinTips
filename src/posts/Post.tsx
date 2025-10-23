import { useParams } from "react-router-dom";
import ReactMarkdown from "react-markdown";
import './postPage.css';
import { PostReader } from "./repo/postReader";

export const PostDetail = () => {
  const { id } = useParams(); // Get the 'id' parameter from the URL
  const markdownContent = PostReader(id || ""); 
  return <div className="postPage">
    <ReactMarkdown children={markdownContent} />
  </div>
};