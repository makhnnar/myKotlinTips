import { useEffect, useState } from "react";
import "./autoNavBar.css";

interface HeadingData {
  id: string;
  text: string | null;
  level: string;
}

interface AutoNavbarProps {
    markdown: string;
}

const AutoNavbar = ({ markdown } : AutoNavbarProps) => {
  const [headings, setHeadings] = useState<HeadingData[]>([]);

  useEffect(() => {
    const headingElements = Array.from(
      document.querySelectorAll(".postPage h1, .postPage h2, .postPage h3, .postPage h4, .postPage h5, .postPage h6")
    ) as HTMLElement[];

    const headingData: HeadingData[] = headingElements.map((heading: HTMLElement) => {
      const generatedId = (heading.textContent || "")
        .replace(/\s+/g, "-")
        .toLowerCase();

      return {
        id: heading.id || generatedId,
        text: heading.textContent,
        level: heading.tagName,
      };
    });

    headingElements.forEach((heading: HTMLElement, index) => {
      if (!heading.id) {
        heading.id = headingData[index].id;
      }
    });

    setHeadings(headingData);
  }, [markdown]);
  
  // Helper function remains to calculate the dynamic padding
  const getIndentation = (level: string): number => {
    const levelNumber = parseInt(level.slice(1), 10);
    // Returns the number of pixels for padding
    return (levelNumber - 1) * 10;
  };

  return (
    <nav className="auto-navbar">
      <ul className="navbar-list">
        {headings.map((heading) => (
          <li key={heading.id} className="navbar-item">
            <a
              href={`#${heading.id}`}
              className={`navbar-link level-${heading.level}`} // Added dynamic class for styling based on level
              style={{ 
                // ONLY keep the necessary dynamic style here
                paddingLeft: `${getIndentation(heading.level)}px`,
              }}
            >
              {heading.text}
            </a>
          </li>
        ))}
      </ul>
    </nav>
  );
};

export default AutoNavbar;