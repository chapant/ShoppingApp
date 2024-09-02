# Stage 1: Build the Vue.js application
FROM node:16-alpine as build

# Set the working directory in the container
WORKDIR /ShoppingApp/web-portal

# Copy the package.json and package-lock.json files
COPY package*.json ./

# Install dependencies
RUN npm install

# Copy the rest of the application code
COPY . .

# Build the Vue.js application
RUN npm run build

# Stage 2: Serve the application with Nginx
FROM nginx:alpine

# Copy the build output from the previous stage
COPY --from=build /ShoppingApp/web-portal/dist /usr/share/nginx/html

# Expose the port that Nginx will serve on
EXPOSE 80

# Run Nginx
CMD ["nginx", "-g", "daemon off;"]
