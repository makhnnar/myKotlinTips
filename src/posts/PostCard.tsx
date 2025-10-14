import { 
  Card, 
  CardContent, 
  CardMedia, 
  Typography, 
  Button, 
  CardActions,
  Box 
} from '@mui/material';
import ArrowForwardIcon from '@mui/icons-material/ArrowForward';

interface PostCardProps {
  title: string;
  description: string;
  imageUrl: string;
}

export const PostCard = ({ title, description, imageUrl }:PostCardProps) => {
  return (
    <Card 
      sx={{ 
        // 1. Make the card itself a flex container to arrange image and content horizontally
        display: 'flex', 
        height: 200, // Set a fixed height for a clean horizontal look
        width: '100%', // Take full width of its container
        maxWidth: 600, // Limit max width for better appearance
        
        // 2. Define the hover effect using the ':hover' pseudo-selector
        transition: '0.3s', // Smooth transition for the effect
        '&:hover': {
          boxShadow: 8, // Increase shadow on hover (theme.shadows[8])
          transform: 'scale(1.02)', // Slightly enlarge the card
        },
      }}
    >
      {/* 3. Card Media (Image) - Fixed width for the image part */}
      <CardMedia
        component="img"
        sx={{ width: 160, flexShrink: 0 }} // flexShrink: 0 prevents the image from shrinking
        image={imageUrl}
        alt={title}
      />

      {/* 4. Content Area - Takes up the remaining space (flexGrow: 1) */}
      <Box sx={{ display: 'flex', flexDirection: 'column', flexGrow: 1 }}>
        <CardContent sx={{ flexGrow: 1, paddingBottom: 0 }}>
          
          {/* Title */}
          <Typography component="div" variant="h5" gutterBottom>
            {title}
          </Typography>
          
          {/* Description */}
          <Typography variant="body2" color="text.secondary" sx={{ 
            // Clamp the description to 3 lines using CSS
            overflow: 'hidden',
            display: '-webkit-box',
            WebkitLineClamp: 3,
            WebkitBoxOrient: 'vertical',
          }}>
            {description}
          </Typography>
        </CardContent>
        
        {/* Watch More Button */}
        <CardActions>
          <Button size="small" variant="contained" endIcon={<ArrowForwardIcon />}>
            Watch More
          </Button>
        </CardActions>
      </Box>
    </Card>
  );
};

export const data = {
    title: "Deep Sea Discovery",
    description: "An incredible short documentary exploring the mysterious bioluminescent creatures found in the abyssal zone. Learn about their unique adaptations and the challenges of studying life thousands of feet below the surface. This is a journey you won't forget.",
    imageUrl: "https://images.unsplash.com/photo-1549419163-1a221295240f?crop=entropy&cs=tinysrgb&fit=max&fm=jpg&ixid=M3w0NDU2NDd8MHwxfHNlYXJjaHwxfHxkZWVwJTIwc2VhJTIwYWJ5c3NhbCU3QzBhfGVufDB8MHx8fDE3MDA1MDYwMDB8&ixlib=rb-4.0.3&q=80&w=400"
};