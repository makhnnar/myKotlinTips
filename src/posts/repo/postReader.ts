import { useState, useEffect } from "react";
import { postsMap } from "./postRepo";

export const PostReader = (id: string) => {
    const [markdownContent, setMarkdownContent] = useState('');
      useEffect(() => {
        fetch(postsMap[id || ""])
          .then(response => response.text())
          .then(text => setMarkdownContent(text))
          .catch(err => console.error('Error fetching markdown:', err));
      }, [id]);
    return markdownContent;
}