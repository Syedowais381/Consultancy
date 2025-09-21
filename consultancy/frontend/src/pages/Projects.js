import React from "react";
import Card from "../components/Card";

const projects = [
  { 
    id: 1, 
    title: "Offshore Pipeline Project", 
    subtitle: "Completed 2024", 
    image: "/images/project1.jpg",
    tag: "Energy"
  },
  { 
    id: 2, 
    title: "Infrastructure Development", 
    subtitle: "Ongoing", 
    image: "/images/project2.jpg",
    tag: "Infrastructure"
  },
  { 
    id: 3, 
    title: "Renewable Energy Initiative", 
    subtitle: "Planning Phase", 
    image: "/images/project3.jpg",
    tag: "Renewable"
  }
];

export default function Projects() {
  return (
    <div>
      <section className="page-hero">
        <div className="container">
          <div className="page-hero-content">
            <span className="page-badge">Our Work</span>
            <h1 className="page-title">Our Projects</h1>
            <p className="page-description">
              Explore our portfolio of successful engineering and consultancy projects across 
              energy and infrastructure sectors.
            </p>
          </div>
        </div>
      </section>
      
      <section className="container page-content">
        <div className="cards-grid">
          {projects.map(project => (
            <Card 
              key={project.id} 
              title={project.title} 
              subtitle={project.subtitle} 
              image={project.image}
              tag={project.tag}
            >
              Detailed project information and technical specifications available upon request.
            </Card>
          ))}
        </div>
      </section>
    </div>
  );
}
